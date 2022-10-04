public class Cat {
    public String name;
    public Integer age;
    public Boolean likesCuddles;
    public String cuddles;

    public Cat(String name, Integer age, Boolean likesCuddles) {
        this.name = name;
        this.age = age;
        this.likesCuddles = likesCuddles;
    }

    void showCatInfo () {
        if(likesCuddles) {
            this.cuddles = "likes cuddles";
        } else {
            this.cuddles = "doesn't like cuddles";
        }
        System.out.printf("This is %s, who is %s year(s) old. %s %s!\n" , this.name, this.age, this.name, this.cuddles );
    }
}