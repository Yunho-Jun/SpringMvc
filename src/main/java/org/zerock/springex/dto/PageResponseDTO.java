package org.zerock.springex.dto;

import lombok.Builder;

import java.util.List;

public class PageResponseDTO <E>{


    private int page;
    private int size;
    private  int total;

    private int start;
    //시작페이지 번호
    private  int end;
    //끝페이지 번호
    private boolean prev ;
    //이전 페이지의 존재여부
    private  boolean next;
    //다음페이지의 존재여부
    private List<E> dtoList;


    @Builder(builderMethodName = "withAll")
    public PageResponseDTO(PageRequestDTO pageRequestDTO, List<E> dtoList, int total){

        this.page = pageRequestDTO.getPage();
        this.size = pageRequestDTO.getSize();

        this.total = total;
        this.dtoList =dtoList;


        this.end = (int)(Math.ceil(this.page/10.0)) * 10;
        //Math.ceil 은 소수값이 존재할 때 값을 올리는 역활을 하는 함수
        //page를 10으로 나눈값을 올림 처리 한 후 * 10

        this.start =this.end-9;

        int last =(int)(Math.ceil((total/(double)size)));

        //마지막 페이지 ex total 123개 / 10.0 -> 12.3 ->13


        this.end = end > last ? last : end ;

        this.prev = this.start >1 ;

        this.next = total > this.end * this.size;


    }

}

