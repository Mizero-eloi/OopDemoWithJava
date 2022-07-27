public class MultipleInheritanceDemo {
}

interface Human{
    void HumanBehavior();
}

interface Employee{
    void EmployeeBehavior();
}

class Programmer implements Employee, Human{
    @Override
    public void HumanBehavior() {

    }

    @Override
    public void EmployeeBehavior() {

    }
}
