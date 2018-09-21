package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
		String ps;
		int n;
		int i;
		int max = 0;
		int[] t = new int[200];
		int min = 1000;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
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
				*(s.Substring(i)) = tempVar2;
			}
		}
		for (i = 0;i < n;i++)
		{
			t[i] = String.valueOf(*(s.Substring(i))).length();
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] > max)
			{
				max = (t + i);
			}
			if (t[i] < min)
			{
				min = t[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == max)
			{
				System.out.printf("%s\n",s.charAt(i));
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (t[i] == min)
			{
				System.out.printf("%s",s.charAt(i));
				break;
			}
		}
	}

}

