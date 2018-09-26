package <missing>;

public class GlobalMembers
{
	public static int function(tangible.RefObject<String> a, int m, char k) //??a[m]?'('
	{
		int t = m;
		while (a.argValue.charAt(t + 1) != 0)
		{
			if (a.argValue.charAt(t + 1) != k)
			{
				System.out.print(m);
				System.out.print(' ');
				System.out.print(t + 1);
				System.out.print("\n");
				return t + 1;
			}
			else
			{
				t = function(a, t + 1, k);
			}
		}
	}

	public static int Main()
	{
		String a = new String(new char[101]);
		char k;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int n = -1;
		k = a.charAt(0);
		while (a.charAt(n + 1) != 0)
		{
		tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
			n = function(tempRef_a, n + 1, k);
			a = tempRef_a.argValue;
		}
		return 0;
	}
}

