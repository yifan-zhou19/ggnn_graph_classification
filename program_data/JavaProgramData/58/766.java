package <missing>;

public class GlobalMembers
{
	public static int judge(String st)
	{
		int l;
		int t;
		l = st.length();
		t = 1;
		if ((st[0].equals(95)) || ((st[0].compareTo(90) <= 0) && (st[0].compareTo(65) >= 0)) || ((st[0].compareTo(122) <= 0) && (st[0].compareTo(97) >= 0)))
		{
			t = 1;
		}
			else
			{
				t = 0;
				return t;
			}
		for (int i = 1;i < l;i++)
		{
			if ((st[i].equals(95)) || ((st[i].compareTo(90) <= 0) && (st[i].compareTo(65) >= 0)) || ((st[i].compareTo(122) <= 0) && (st[i].compareTo(97) >= 0)) || ((st[i].compareTo(57) <= 0) && (st[i].compareTo(48) >= 0)))
			{
				t = 1;
			}
			else
			{
				t = 0;
				break;
			}
		}
		return t;
	}

	public static int Main()
	{
		int n;
		int i;
		int t;
		String st = new String(new char[100]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		st = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			st = new Scanner(System.in).nextLine();
			t = judge(st);
			System.out.print(t);
			System.out.print("\n");
		}
		return 0;
	}

}

