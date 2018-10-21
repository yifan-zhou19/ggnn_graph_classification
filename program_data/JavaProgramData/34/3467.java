package <missing>;

public class GlobalMembers
{
	public static void ou(int n)
	{
		int answer;
		answer = n / 2;
		System.out.print(n);
		System.out.print("/2=");
		System.out.print(answer);
		System.out.print("\n");
		if (answer % 2 == 0)
		{
			ou(answer);
		}
		else
		{
			ji(answer);
		}
	}
	public static void ji(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
			return;
		}
		int answer;
		answer = n * 3 + 1;
		System.out.print(n);
		System.out.print("*3+1=");
		System.out.print(answer);
		System.out.print("\n");
		if (answer % 2 == 0)
		{
			ou(answer);
		}
		else
		{
			ji(answer);
		}

	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n % 2 == 1)
		{
			ji(n);
		}
		else
		{
			ou(n);
		}
	}
}

