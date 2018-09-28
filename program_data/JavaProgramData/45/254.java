package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	String ch1 = new String(new char[50]);
	String ch2 = new String(new char[50]);
	int len1;
	int len2;
	int i;
	int j;
	int k;
	int c;
	int d;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		ch1 = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		ch2 = tempVar2.charAt(0);
	}
	len1 = ch1.length();
	len2 = ch2.length();

	for (i = 0;i < len2;i++)
	{
		k = 1;
		j = 0;
	do
	{
		c = (int)ch1.charAt(j);
			d = (int)ch2.charAt(i + j);

			if (c == d)
			{
				k = 1;
			}
			else
			{
				k = 0;
			}
			j++;
			if (j >= len1)
			{
				break;
			}
	} while (k == 1);

			if (k != 0)
			{
				System.out.printf("%d\n",i);
				break;
			}
	}
	}
}

