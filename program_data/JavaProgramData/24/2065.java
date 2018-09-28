package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int m = 0;
	int k = 0;
	int p = 1;
	int[] sl = new int[500];
	int max = 0;
	int min;
	int a = 0;
	int b = 0;
	String s = new String(new char[500]);
	char[][] f = new char[200][50];
	s = new Scanner(System.in).nextLine();
	n = s.length();
	for (i = 0;i < n;i++)
	{
		if ((s.charAt(i) != ' ') && (s.charAt(i) != ','))
		{
		f[m][k] = s.charAt(i);
		k++;
		}
		else if (((s.charAt(i) == ' ') || (s.charAt(i) == ',')) && ((s.charAt(i - 1) != ' ') && (s.charAt(i - 1) != ',')))
		{
		f[m][k] = '\0';
		m++;
		k = 0;
		p++;
		}
		else
		{
		m = m;
		k = 0;
		p = p;
		}
		f[m][k] = '\0';

	}
	for (i = 0;i < p;i++)
	{
	sl[i] = String.valueOf(f[i]).length();
	}
	for (i = 0;i < p;i++)
	{
		if (max < sl[i])
		{
		max = sl[i];
		a = i;
		}
		else
		{
		max = max;
		a = a;
		}

	}
	min = max;
	for (i = 0;i < p;i++)
	{
		if (min > sl[i])
		{
		min = sl[i];
		b = i;
		}
		else
		{
		min = min;
		b = b;
		}
	}
	System.out.printf("%s\n",f[a]);
	System.out.printf("%s",f[b]);
	return 0;
	}
}
