package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		i = 1;
		s = 0;
		do
		{
			if (i % 7 == 0)
			{
				i++;
			}
			else if ((i % 10 == 7) || ((70 <= i) && (i <= 79)))
			{
				i++;
			}
			else
			{
				s = s + (i * i);
				i++;
			}
		} while (i <= n);
		System.out.printf("%d",s);
		return 0;
	}
}

