package <missing>;

public class GlobalMembers
{
	public static int[] an1 = new int[255];
	public static int[] an2 = new int[255];
	public static String s1 = new String(new char[255]);
	public static String s2 = new String(new char[255]);
	public static int Main()
	{
	s1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	s2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
	int i;
	int j;
	int nLen1;
	int nLen2;
	for (i = 0;i < 255;i++)
	{
		an1[i] = 0;
		an2[i] = 0;
	}
	for (i = 0;i < 255;i++)
	{
		if (s1.charAt(i) == '\0')
		{
			nLen1 = i;
			break;
		}
	}
	for (i = 0;i < 255;i++)
	{
		if (s2.charAt(i) == '\0')
		{
			nLen2 = i;
			break;
		}
	}
	j = 0;
	for (i = nLen1 - 1;i >= 0 ; i--)
	{
	an1[j++] = s1.charAt(i) - '0';
	}
	j = 0;
	for (i = nLen2 - 1;i >= 0 ; i--)
	{
	an2[j++] = s2.charAt(i) - '0';
	}
	for (i = 0;i < 255; i++)
	{
	an1[i] += an2[i];
	if (an1[i] >= 10)
	{
	an1[i] -= 10;
	an1[i + 1]++;
	}
	}
	int a = 0;
	for (i = 255;i >= 0;i--)
	{
			if (i == 0)
			{
			  System.out.print(an1[i]);
	break;
			}
		if (an1[i] == 0 && a == 0)
		{
			continue;
		}
		if (an1[i] != 0)
		{
		a = 1;
		}
		System.out.print(an1[i]);
	}
	 return 0;
	}
}

