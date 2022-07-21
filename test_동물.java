package test;
class Main {
    public static void main(String[] args) {
        Button aButton = new Button();
        aButton.setClickEventListener(new 고양이());
        aButton.fireClick();
        // 나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 강아지());
        aButton.fireClick();
        // 나(강아지)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.setClickEventListener(new 부엉이());
        // 나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.

        aButton.fireClick();
    }
}

class Button {

    private 동물 a동물 ;

    public void setClickEventListener(동물 a동물) {

        this.a동물 = a동물;

    }

    public void fireClick() {

        a동물.응답();
//        System.out.printf("나(%s)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다." , 동물이름);
    }
}

interface 동물{
    public void 응답();

}

class 고양이 implements 동물{
    public void 응답(){
        System.out.println("나(고양이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}

class 강아지 implements 동물{
    public void 응답(){
        System.out.println("나(강아지)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}

class 부엉이 implements 동물{
    public void 응답(){
        System.out.println("나(부엉이)는 방금 버튼이 클릭되었다는 사실을 전달 받았습니다.");
    }
}

