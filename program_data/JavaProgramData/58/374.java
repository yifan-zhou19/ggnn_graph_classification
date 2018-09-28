import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************
	//* ????3.cpp              *
	//* ?? 1000012747            *
	//* ????????????? *
	//******************************
	public static int Main()
	{
		int n; //??n,m??????????len???????i??????t??????????
		int m;
		int len;
		int i;
		int t;
		char[][] a = new char[100][80]; //?????????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read(); //??????????
		m = n;
		while (m > 0)
		{
			t = 0; //??????????t=0
			a[n - m] = new Scanner(System.in).nextLine(); //?????
			len = String.valueOf(a[n - m]).length(); //???????
			if ((a[n - m][0] == '_') || ((a[n - m][0] >= 'A') && (a[n - m][0] <= 'Z')) || ((a[n - m][0] >= 'a') && (a[n - m][0] <= 'z'))) //????????
			{
				for (i = 1;i < len;i++)
				{
					if ((a[n - m][i] == '_') || ((a[n - m][i] >= 'A') && (a[n - m][i] <= 'Z')) || ((a[n - m][i] >= 'a') && (a[n - m][i] <= 'z')) || ((a[n - m][i] >= '0') && (a[n - m][i] <= '9')))
					{
						t++; //????????????
					}
				}
				if (t == len - 1)
				{
					System.out.print(1);
					System.out.print("\n");
				}
				else
				{
					System.out.print(0);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(0);
				System.out.print("\n");
			}
			m--;
		}
		return 0;
	}
}

