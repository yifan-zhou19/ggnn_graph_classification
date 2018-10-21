package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		int[] num = new int[101];
		int digit;
		int[] ans = new int[100];
		int left;
		int head;
		int tail;
		int answer_isnt_zero = 0;
		for (int i = 0;i < 100;i++)
		{
			ans[i] = -1;
		}
		String ch = new String(new char[101]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ch = tempVar.charAt(0);
		}
		digit = ch.length();
		for (int i = 0;i < digit;i++)
		{
			num[i] = (int)ch.charAt(i) - 48;
		}
		for (int i = 0;i < digit;i++)
		{
			ans[i] = num[i] / 13;
			num[i + 1] += (num[i] % 13) * 10;
		}
		for (tail = 99;ans[tail] == -1;tail--)
		{
			;
		}
		for (head = 0;ans[head] == 0;head++)
		{
			;
		}
		for (int i = head;i <= tail;i++)
		{
			System.out.printf("%1d",ans[i]);
			answer_isnt_zero = 1;
		}
		if (answer_isnt_zero == 0)
		{
			System.out.print("0");
		}
		System.out.print("\n");
		System.out.printf("%d\n",num[digit] / 10);
	 }
}

