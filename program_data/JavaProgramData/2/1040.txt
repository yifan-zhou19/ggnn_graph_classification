public class test
{
	public int num;
	public int[] book = new int[100];

}

package <missing>;

public class GlobalMembers
{
	public static test[] a = tangible.Arrays.initializeWithDefaulttestInstances(26);
	public static int Main()
	{
		int n;
		int i;
		int j;
		int index;
		int temp;
		int max;
		String s = new String(new char[100]);
		char ch;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < 26;i++)
		{
			a[i].num = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				index = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			for (j = 0;s.charAt(j) != '\0';j++)
			{
				temp = (int)(s.charAt(j) - 'A');
				a[temp].book[a[temp].num] = index;
				a[temp].num++;
			}
		}
		max = 0;
		for (i = 0;i < 26;i++)
		{
			if (a[i].num > a[max].num)
			{
				max = i;
			}

		}
	  ch = (char)('A' + max);
			System.out.printf("%c\n",ch);
		System.out.printf("%d\n",a[max].num);
		for (i = 0;i < a[max].num;i++)
		{
			System.out.printf("%d\n",a[max].book[i]);
		}

		return 0;
	}
}

