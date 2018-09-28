public class student
{
	public String num = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
	public static student[] line = tangible.Arrays.initializeWithDefaultstudentInstances(100);
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int temp = 0;
		int m;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[100];
		int[] b = new int[100];
		char[][] s = new char[100][10];
		char[][] y = new char[100][10];
		String exchange = new String(new char[10]);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				line[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				line[i].age = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (line[i].age >= 60)
			{
				temp++;
			}
		}
		j = 0;
		for (i = 0;i < n;i++)
		{
				if (line[i].age >= 60)
				{
					s[j] = line[i].num;
					b[j] = line[i].age;
					j++;
				}

		}
		for (j = 0;j < temp;j++)
		{
			for (k = 0;k < temp - j;k++)
			{
				if (b[k] < b[k + 1])
				{
					e = b[k];
					b[k] = b[k + 1];
					b[k + 1] = e;
					exchange = s[k];
					s[k] = s[k + 1];
					s[k + 1] = exchange;
				}
			}
		}
		for (j = 0;j < temp;j++)
		{
			System.out.printf("%s\n",s[j]);
		}
		m = 0;
		for (i = 0;i < n;i++)
		{
				if (line[i].age < 60)
				{
					y[m] = line[i].num;
					m++;
				}
		}
		for (j = 0;j < n - temp;j++)
		{
			 System.out.printf("%s\n",y[j]);
		}


	}
}

