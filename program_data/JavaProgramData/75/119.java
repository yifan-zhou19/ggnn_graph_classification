package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int num = 0;
		int l;
		int j = 0;
		int[] c = new int[1000];
		int max = 0;
		String m = new String(new char[10000]);
		String n = new String(new char[10000]);
		String t = new String(new char[100]);
		m = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = m.length();
		for (i = 0;i <= l;i++)
		{
			if (m.charAt(i) == ',' || m.charAt(i) == '\0')
			{
				num++;
				t = tangible.StringFunctions.changeCharacter(t, j, '\0');
				j = 0;
				a[num] = Integer.parseInt(t);
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, j, m.charAt(i));
				j++;
			}
		}
		num = 0;
		j = 0;
		l = n.length();
		for (i = 0;i <= l;i++)
		{
			if (n.charAt(i) == ',' || n.charAt(i) == '\0')
			{
				num++;
				t = tangible.StringFunctions.changeCharacter(t, j, '\0');
				j = 0;
				b[num] = Integer.parseInt(t);
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, j, n.charAt(i));
				j++;
			}
		}
		System.out.print(num);
		System.out.print(" ");
		for (i = 0;i < 1000;i++)
		{
			for (j = 1;j <= num;j++)
			{
				if (i >= a[j] != 0 && i < b[j])
				{
					c[i]++;
				}
			}
			if (max < c[i])
			{
				max = c[i];
			}
		}
		System.out.print(max);
		return 0;
	}


}

