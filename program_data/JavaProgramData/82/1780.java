package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012713 **
	//*???2013.10.24  **
	//********************************
	public static int Main()
	{
		int m = 0; // ???????m,p,????n????a????b
		int p = 0;
		int n;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++) //?????
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a >= 90 && a <= 140 && b >= 60 && b <= 90) //????????
			{
				m = m + 1; //??????
			}
			else //??
			{
				if (p == 0) //??p???????????m
				{
					p = m;
				}
				else if (p > 0 && p < m) //??p??????m???m??
				{
					p = m;
				}
				m = 0; //m??
			}
		}
		if (p < m) //??p?m
		{
			p = m;
		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}


}

