package lab2_task3;

public class cl {
	int values[];

    cl (int i)
    {
        values = new int[i];
    }
    void PrintArray (int i)
    {
        if(i==0) return;
        else PrintArray(i-1);

        System.out.println("[" + (i-1) + "] " + values[i-1]);
    }
}
