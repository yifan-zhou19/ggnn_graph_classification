import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int count = 0;
		char[][] a = new char[110][110];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (int i = 0; i < n; i++)
		{
			a[i] = new Scanner(System.in).nextLine();
		}
		count = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	/*
		for(int i = 0; i<n; i++)
		{
			for(int j = 0; j<n; j++)
				cout<<a[i][j];
			cout<<endl;
		}
	*/
		while (count > 1)
		{
			count--;
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (a[i][j] == '@')
					{
						if ((i - 1) >= 0 && a[i - 1][j] == '.')
						{
							a[i - 1][j] = '$';
						}
						if ((i + 1) < n && a[i + 1][j] == '.')
						{
							a[i + 1][j] = '$';
						}
						if ((j + 1) < n && a[i][j + 1] == '.')
						{
							a[i][j + 1] = '$';
						}
						if ((j - 1) >= 0 && a[i][j - 1] == '.')
						{
							a[i][j - 1] = '$';
						}
					}
				}
			}

					for (int i = 0; i < n; i++)
					{
						for (int j = 0; j < n; j++)
						{
							if (a[i][j] == '$')
							{
								a[i][j] = '@';
							}
						}
					}

					//for(int i = 0; i<n; i++)
					//{
					//	for(int j = 0; j<n; j++)
					//		
					//		cout<<a[i][j];
					//	cout<<endl;
					//}
					//cout<<endl;
		}

		count = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{

				if (a[i][j] == '@')
				{
					count++;
				}
			}
		}
				System.out.print(count);

				return 0;

	}
}

