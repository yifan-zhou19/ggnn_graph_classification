public class patient
{
	public String ID = new String(new char[11]); //?????
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static patient[] pa = tangible.Arrays.initializeWithDefaultpatientInstances(100); //?????
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				pa[i].ID = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pa[i].age = Integer.parseInt(tempVar3);
			}
		} //??100?????
		patient[] old = tangible.Arrays.initializeWithDefaultpatientInstances(100); //????????????60??
		int count = 0;
		for (i = 0;i < n;i++)
		{
			if (pa[i].age >= 60)
			{
				old[count].ID = pa[i].ID;
				old[count].age = pa[i].age;
				count++;
				pa[i].age = 0;
			}
		}
		int k;
		int j;
		int e;
		String ex = new String(new char[11]);
		for (k = 1;k < count;k++)
		{
			for (j = 0;j < count - k;j++)
			{
				if (old[j].age < old[j + 1].age)
				{
					e = old[j + 1].age;
					old[j + 1].age = old[j].age;
					old[j].age = e;
					ex = old[j].ID;
					old[j].ID = old[j + 1].ID;
					old[j + 1].ID = ex;
				}
			}
		}
		for (i = 0;i < count;i++)
		{
			System.out.printf("%s\n",old[i].ID);
		}
		for (i = 0;i < n;i++)
		{
			if (pa[i].age != 0)
			{
				System.out.printf("%s\n",pa[i].ID);
			}
		}
	}
}

