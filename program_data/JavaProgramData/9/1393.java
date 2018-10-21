public class person
{
	public int age;
	public String num = new String(new char[10]);

}

package <missing>;

public class GlobalMembers
{
	public static person[] pat = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person[] old = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person[] you = tangible.Arrays.initializeWithDefaultpersonInstances(100);
	public static person exchange = new person();
	public static int Main()
	{
		int n;
		int i;
		int p;
		int q;
		int result;
		int k = 0;
		int t = 0;
		int temp;
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
				pat[i].num = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				pat[i].age = Integer.parseInt(tempVar3);
			}
			if (pat[i].age >= 60)
			{
				old[k].age = pat[i].age;
				old[k].num = pat[i].num;
				k++;
			}
			else
			{
				you[t].num = pat[i].num;
				t++;
			}
		}
		for (p = 0;p < k;p++)
		{
			for (q = 0;q < k - p;q++)
			{
				if (old[q].age < old[q + 1].age)
				{
					exchange.age = old[q].age;
					old[q].age = old[q + 1].age;
					old[q + 1].age = exchange.age;
					exchange.num = old[q].num;
					old[q].num = old[q + 1].num;
					old[q + 1].num = exchange.num;
				}
			}
		}
		for (result = 0;result < k;result++)
		{
			System.out.printf("%s\n",old[result].num);
		}
		for (result = 0;result < t;result++)
		{
			System.out.printf("%s\n",you[result].num);
		}

		return 0;
	}

}

