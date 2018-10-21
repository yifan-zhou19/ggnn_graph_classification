package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float n;
		float a;
		float b;
		float i;
		float c = 0F;
		float s = 0F;
	n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
	for (a = 7F;a <= n;a = a + 7)
	{
		s = s + a * a;
	}
	for (b = 17F;b <= n;b = b + 10)
	{
		s = s + b * b;
	}
	if (n >= 80F)
	{
			{
				for (i = 70F;i <= 79F;i++)
				{
		s = s + i * i;
				}
		}
		s = s - 2 * 77 * 77 - 70 * 70;
	}
	if (n >= 70F && n < 77F)
	{
		{
			for (i = 70F;i <= n;i++)
			{
		s = s + i * i;
			}
}
	s = s - 70 * 70 - 77 * 77;
	}
	if (n >= 77F && n < 80F)
	{
			{
				for (i = 78F;i <= n;i++)
				{
			s = s + i * i;
				}
		}
		s = s - 70 * 70 - 77 * 77;
	}
	if (n < 70F)
	{
		s = s;
	}
	for (i = 1F;i <= n;i++)
	{
		c = c + i * i;
	}
	s = c - s;
	System.out.print(s);
	System.out.print("\n");
	return 0;
	}
}

