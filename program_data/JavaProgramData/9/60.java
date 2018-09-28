public class Patient
{
	public String id = new String(new char[10]);
	public int age;
	public int arranged;

}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t = 0;
		int j;
		Patient[] pai = tangible.Arrays.initializeWithDefaultPatientInstances(100);
		Patient[] orderd = tangible.Arrays.initializeWithDefaultPatientInstances(100);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			pai[i].id = ConsoleInput.readToWhiteSpace(true).charAt(0);
			pai[i].age = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			pai[i].arranged = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (pai[i].age >= 60)
			{
				orderd[t] = pai[i];
				pai[i].arranged = 1;
				t++;
			}
		}
		for (i = 0;i < t;i++)
		{
			for (j = 0;j < t - 1 - i;j++)
			{
				if (orderd[j].age < orderd[j + 1].age)
				{
					Patient temp = orderd[j];
					orderd[j] = orderd[j + 1];
					orderd[j + 1] = temp;
				}
			}
		}
		 for (i = 0;i < n;i++)
		 {
			if (pai[i].arranged == 0)
			{
				orderd[t] = pai[i];
				t++;
			}
		 }
		for (i = 0;i < n;i++)
		{
			System.out.print(orderd[i].id);
			System.out.print("\n");
		}







		return 0;
	}
}

