package interface_study;

public interface Father {
void nature();
default void love() {
System.out.println("Fathers love");
}
static void care() {
System.out.println("Fathers care");
}
	

}
