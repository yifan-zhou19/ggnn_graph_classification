package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????????n
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String w = new String(new char[41]); //?????????
		int l = 0; //??l?????????
		w = ConsoleInput.readToWhiteSpace(true).charAt(0);
		l = w.length();
		System.out.print(w);
		n--;
		while (n-- != 0) //?????????????????????80??????l????????l???????
		{
			w = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (l + w.length() + 1 <= 80)
			{
				l = l + w.length() + 1;
				System.out.print(' ');
				System.out.print(w);
			}
			else
			{
				l = w.length();
				System.out.print("\n");
				System.out.print(w);
			}
		}
		return 0;
	}
}

