package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1005]);
		String b = new String(new char[1005]);
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len;
		int i;
		int[] sum = new int[1005];
		int t = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(sum,0,(Integer.SIZE / Byte.SIZE));
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) >= 'a')
			{
				b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i) - 32);
			}
			else
			{
			b = tangible.StringFunctions.changeCharacter(b, t, a.charAt(i));
			}
			while (a.charAt(i) == b.charAt(t) || a.charAt(i) == b.charAt(t) + 32 || a.charAt(i) == b.charAt(t) - 32)
			{
				i++;
				sum[t]++;
			}
			t++;
			i--;
		}
		for (i = 0;i < t;i++)
		{
			System.out.print("(");
			System.out.print(b.charAt(i));
			System.out.print(",");
			System.out.print(sum[i]);
			System.out.print(")");
		}
		System.out.print("\n");
		return 0;
	}









}

