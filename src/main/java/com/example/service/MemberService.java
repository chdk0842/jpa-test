package com.example.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import com.example.entity.Member;
import com.example.entity.emf.UniqueEntityManagerFactory;

public class MemberService {
	public void save(Member member) {
		// 엔티티 매니저 팩토리:애플리케이션 당 하나
		EntityManagerFactory emf = UniqueEntityManagerFactory.emf;

		// 엔티티 매니저
		EntityManager em = emf.createEntityManager();

		// 트랙잭션(쪼갤 수 없는 업무의 단위)
		EntityTransaction tx = em.getTransaction();

		try {
			
			tx.begin(); // 트랙잭션 시작과 동시에 커넥션을 획득

			em.persist(member); // 영속 : 엔티티 매니저를 통해 엔티티를 영속성 컨텍스트에(영구 저장하는 환경) 저장

			tx.commit(); // 실제 DB에 저장이 된다.
			
		} catch (Exception e) {
			
            e.printStackTrace();
            tx.rollback(); // 커밋 직전으로 되돌아가기.
            
		} finally {
			
			em.close(); // 준영속 :영속성 컨텍스트에서 관리하던 영속상태의 엔티티를 영속성 컨텍스트가 관리하지 않음.
			
			/* 셋 똑같음.
			 * em.close(); 
			 * em.detach(member);
			 * em.clear();
			 */
			/* em.remove(member); */
		    
//		   persist(저장)하기 전은 비영속 , persist(저장) 영속, close(준영속) 영속성 컨텍스트에서 나옴, remove(멤버라는 엔티티객체 지움)
		}

	}
}
