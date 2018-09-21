package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[50]);
		String jl = new String(new char[50]);
		String il = new String(new char[50]);
		int i = 100;
		int j = 0;
		while (scanf("%s",s) != EOF)
		{
			if (s.length() > j)
			{
				jl = s;
				j = s.length();
			}
			if (s.length() < i)
			{
				il = s;
				i = s.length();
			}
		}
		System.out.printf("%s\n%s",jl,il);
	}



}
