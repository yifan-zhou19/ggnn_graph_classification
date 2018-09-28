package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String ch = new String(new char[510]); //??ch????????n?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ch = ConsoleInput.readToWhiteSpace(true).charAt(0);
		int len = ch.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int cnt;
		int num = 0;
		int big = 0; //cnt???????????num???????big?????????howmany????????
		int howmany = 0;
		String[] choice = new String[510]; //????choice??????????

		for (int i = 0; i <= len - n; i++) //????????????
		{
			num = 0;
			for (int j = i; j <= len - n; j++)
			{
				cnt = 0;
				p = ch.charAt(i);
				q = ch.charAt(j); //?????p,q???????
				for (int k = 0; k < n; k++)
				{
					if (*p++== *q++) //????
					{
						cnt++;
					}
				}
				if (cnt == n) //????n?????????num?1
				{
					num++;
				}
			}
			if (num > big) //?num???????????????
			{
				big = num;
				howmany = 0;
				choice[howmany] = p - n;
			}
			else if (num == big) //?num?????????howmany?1??????
			{
				howmany++;
				choice[howmany] = p - n;
			}
		}

		if (big == 1) //???????No
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print(big);
			System.out.print("\n");
			for (int l = 0; l <= howmany; l++)
			{
				for (int y = 0; y < n; y++)
				{
					System.out.print(choice[l]++);
				}
				System.out.print("\n");
			}
		}
		return 0;
	}

}

