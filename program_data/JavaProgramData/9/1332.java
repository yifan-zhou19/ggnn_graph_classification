public class info
{
	public String num = new String(new char[10]);
	public int age;
}
public class info1
{
	public String num1 = new String(new char[10]);
	public int age1;
}

package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		info[] patient = tangible.Arrays.initializeWithDefaultinfoInstances(101);
		info1[] old = tangible.Arrays.initializeWithDefaultinfo1Instances(101);
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (i = 0,j = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				patient[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				patient[i].age = Integer.parseInt(tempVar3);
			}
			if (patient[i].age >= 60)
			{
				old[j].num1 = patient[i].num;
				old[j].age1 = patient[i].age;
				j++;
			}
		}
		int m = j;
		for (j = 1;j < m;j++)
		{
			for (i = 0;i < m - j;i++)
			{
				if (old[i].age1 < old[i + 1].age1)
				{
					old[100] = old[i];
					old[i] = old[i + 1];
					old[i + 1] = old[100];
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%s\n",old[i].num1);
		}
		for (i = 0;i < n;i++)
		{
			if (patient[i].age < 60)
			{
				System.out.printf("%s\n",patient[i].num);
			}
		}
	}
}

