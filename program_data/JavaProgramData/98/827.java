package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int f = 0;
		int f1 = 0;
		String w = new String(new char[41]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		while ((w = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			if ((f + 1 + w.length()) <= 80)
			{
				if (f1 != 0)
				{
					f++;
					System.out.print(" ");
				}
				System.out.print(w);
				f1++;
				f += w.length();
			}
			else
			{
				System.out.print("\n");
				f1 = 0;
				System.out.print(w);
				System.out.print(" ");
				f = w.length() + 1;
			}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(w,0,(Character.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

