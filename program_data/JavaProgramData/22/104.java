package <missing>;

public class GlobalMembers
{
	public static int[] pow10 = new int[5];

	public static int str2int(tangible.RefObject<String> s, int lens)
	{
		int i;
		int r = 0;
		for (i = lens - 1;i >= 0;i--)
		{
			r += (s.argValue.charAt(i) - '0') * pow10[lens - 1 - i];
		}
		return r;
	}


	public static int Main()
	{
		int[] data = new int[1000];
		int n = 0;
		String s = new String(new char[1000]);
		s = new Scanner(System.in).nextLine();

		int head = 0;
		int l = 0;
		int index = 0;
		int i;
		int b = 1;

		int r = 1;
		for (i = 0;i < 5;i++)
		{
			pow10[i] = r;
			r *= 10;
		}

		for (i = 0;i < s.length();i++)
		{
			if (s.charAt(i) == ',')
			{
				data[index] = str2int(s.Substring(head), i - head);
				index++;
				head = i + 1;
			}
		}
		data[index] = str2int(s.Substring(head), i - head);
		n = index + 1;

		if (n == 1)
		{
			System.out.print("No");
			System.out.print("\n");
			return 0;
		}



		int m1 = data[0];
		int m2;
		for (i = 0;i < n;i++)
		{
			if (m1 < data[i])
			{
				m1 = data[i];
			}
		}
		m2 = 0;
		int temp = 0;
		for (i = 0;i < n;i++)
		{
			if (m2 < data[i] && m1> data[i])
			{
			m2 = data[i];
			temp = 1;
			}
		}
		if (temp != 0)
		{
			System.out.print(m2);
			System.out.print("\n");
		}
		else
		{
			System.out.print("No");
			System.out.print("\n");
		}


		return 0;
	}


}

