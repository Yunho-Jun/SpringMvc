package org.zerock.springex.sample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("normal")
//@Repository를 이용해서 해당클래스의 객체를 스프링의 빈으로 처리되도록 구성
public class SampleDAOImpl implements SampleDAO{

}
