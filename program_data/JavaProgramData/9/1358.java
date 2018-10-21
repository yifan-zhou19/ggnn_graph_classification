public class mao
{
	public String name = new String(new char[10]);
	public int age;
}

package <missing>;

public class GlobalMembers
{
		public static mao[] pat = tangible.Arrays.initializeWithDefaultmaoInstances(100);
	public static int Main()
	{
		int max = new int(int age[100],int n);
		int n;
		int i;
		int k;
	int[] age = new int[100];
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
				pat[i].name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			if (pat[i].age >= 60)
			{
			age[i] = 200 + pat[i].age;
			}
			else
			{
			age[i] = 101 - i;
			}
		}
		for (i = 0;i < n;i++)
		{
						k = max(age, n);
						System.out.printf("%s\n",pat[k].name);
		}
		return 0;
	}
	public static int max(int[] age, int n)
	{
		int a = 0;
		int j = 0;
		int k = 0;
		for (j = 0;j < n;j++)
		{
			if (age[j] > a)
			{
				a = age[j];
				k = j;
			}
		}
		age[k] = 0;
		return k;
	}
}

