package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int l;
		int i;
		int m = 0;
		int j;
		int max;
		int min;
		int k = 0;
		int x = 0;
		int y = 0;
		int[] b = new int[1000];
		String a = new String(new char[1000]);
		String p = a;
		String[] q = new String[50];
		a = new Scanner(System.in).nextLine();
		l = a.length();
		q[0] = a.charAt(0);
			for (j = 0;j <= l;j++)
			{
				if (a.charAt(j) != ' ' && a.charAt(j) != '\0')
				{
				 m++;
				}
				if (a.charAt(j) == ' ' || a.charAt(j) == '\0')
				{
				  a = tangible.StringFunctions.changeCharacter(a, j, '\0');
				   b[k] = m;
				   q[k + 1] = a.charAt(j + 1);
				   m = 0;
				   k++;
				}
			}
		max = b[0];
		min = b[0];
		for (i = 1;i < k;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				x = i;
			}
			if (b[i] < min)
			{
				min = b[i];
				y = i;
			}
		}
		System.out.printf("%s\n",q[x]);
			System.out.printf("%s\n",q[y]);
	}




}

