package lab2_task3;

public class mainclass {

	public static void main(String[] args) {
		cl obj = new cl(10);
        int i;
        for (i=0;i<10;i++)
        {
            obj.values[i] = i;
        }

        obj.PrintArray(10);
	}

}
