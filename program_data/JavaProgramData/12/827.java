package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] s = new int[16];
		int i;
		int n;
		int a = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s[0] = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
		loop:
		a = 0;
		i = 1;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
			i++;
		} while (s[i - 1] != 0);
		n = i - 1;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - i;j++)
			{
			if (s[i] == 2 * s[i + j] || s[i + j] == s[i] * 2)
			{
				a = a + 1;
			}
			}
		}
		System.out.printf("%d\n",a);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			s[0] = Integer.parseInt(tempVar3);
		}
		if (s[0] != -1)
		{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			goto loop;
		}
	}

}

