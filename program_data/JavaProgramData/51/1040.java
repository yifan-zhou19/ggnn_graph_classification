import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		String word = new String(new char[500]);
		word = new Scanner(System.in).nextLine();
		int l = 0;
		l = word.length();
		char[][] chuan = new char[500][500];
		int i = 0;
		int j = 0;
		//int p=0;
		for (i = 0;i < l - m + 1;i++)
		{
			for (j = 0;j < m;j++)
			{
				chuan[i][j] = word.charAt(i + j);
			}
			chuan[i][j] = '\0';
			//p++;
		}
		/*for (int k=0;k<l-m+1;k++)
		{
		    cout<<chuan[k]<<endl;
		}
	cout<<p<<endl;
		*/
		int[] num = new int[500];
		for (int x = 0;x < l - m + 1;x++)
		{
			for (int y = x;y < l - m + 1;y++)
			{
				int sum = 0;
					for (int p = 0;p < m;p++)
					{
						if (chuan[y][p] != chuan[x][p])
						{
							sum++;
							break;
						}
						//num[x]++;
					}
					if (sum == 0)
					{
						num[x]++;
					}
			}
		}

			/*for (int k=0;k<l-m+1;k++)
			{
			    cout<<num[k]<<endl;
			}
	
			*/
			int temp = num[0];
			int tempx = 0;
			for (int i = 1;i < l;i++)
			{
				if (num[i] > temp)
				{
					temp = num[i];
					tempx = i;
				}
			}
			if (temp == 1)
			{
				System.out.print("NO");
				System.out.print("\n");
			}
			else
			{
			System.out.print(num[tempx]);
			System.out.print("\n");
			for (int i = 0;i < l;i++)
			{
				if (num[i] == num[tempx])
				{
					System.out.print(chuan[i]);
					System.out.print("\n");
				}
			}
			}
		return 0;
	}

}

