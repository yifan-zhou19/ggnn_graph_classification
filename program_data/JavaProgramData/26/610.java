package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, ' ', (Character.SIZE / Byte.SIZE));
		int i = 0;
		int n;
		while ((a[i] = System.in.read()) != '\n')
		{
			i++;
		}
		n = i + 1;
		for (i = 0 ; i < n ; i++)
		{
			if (a.charAt(i) != ' ' || (a.charAt(i) == ' ' && a.charAt(i + 1) != ' '))
			{
				System.out.print(a.charAt(i));
			}
		}
		return 0;
	}


}
