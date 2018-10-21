package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int count = 0;
		int b = -1;
		int v = 87787;
		a = new Scanner(System.in).nextLine();
		String max = new String(new char[100]);
		String min = new String(new char[100]);
		String t = new String(new char[100]);
		int n = a.length();
		a = tangible.StringFunctions.changeCharacter(a, n, ' ');






		for (int i = 0;i <= n;i++)
		{
			if (a.charAt(i) != ' ')
			{
				t = tangible.StringFunctions.changeCharacter(t, count, a.charAt(i));
				count++;
			}
			else
			{
				t = tangible.StringFunctions.changeCharacter(t, count, '\0');
				if (count < v)
				{
					v = count;
					min = t;
				}
				if (count > b)
				{
					b = count;
					max = t;
				}
				count = 0;
			}
		}
		System.out.printf("%s\n%s\n",max,min);
		return 0;
	}



































}

