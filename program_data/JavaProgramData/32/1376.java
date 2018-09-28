import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (int t = 0;t < n;t++)
	   {
			System.in.read();
			final int MAX_LEN = 200;
		int[] an1 = new int[MAX_LEN];
		int[] an2 = new int[MAX_LEN];
		String seLine1 = new String(new char[MAX_LEN + 1]);
		String seLine2 = new String(new char[MAX_LEN + 1]);

		seLine1 = new Scanner(System.in).nextLine();
		seLine2 = new Scanner(System.in).nextLine();
		int nLen1 = seLine1.length();
		int nLen2 = seLine2.length();
		//cout<<seLine1<<endl<<seLine2<<endl;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(an2, 0,(Integer.SIZE / Byte.SIZE));
		   int i;
		   int j = 0;
		for (i = nLen1 - 1; i >= 0; i--)
		{
			an1[j++] = seLine1.charAt(i) - '0';
		}
		j = 0;
		for (i = nLen2 - 1; i >= 0;i--)
		{
			an2[j++] = seLine2.charAt(i) - '0';
		}
		for (i = 0; i < MAX_LEN ;i++)
		{
			//printf("%d %d %d ",i, an1[i], an2[i]);
			if (an1[i] >= an2[i])
			{
				an1[i] -= an2[i];
			}
			else
			{
				 an1[i] = 10 + an1[i] - an2[i];
				 an1[i + 1] -= 1;
			}
			//printf("aa%d %d\n", i, an1[i]);
		}
		i = MAX_LEN - 1;
		while (an1[i] == 0)
		{
			i--;
		}
		//cout<<i<<endl;
		for (;i >= 0; i--)
		{
			System.out.print(an1[i]);
		}
		System.out.print("\n");
	   }
		return 0;
	}


}

