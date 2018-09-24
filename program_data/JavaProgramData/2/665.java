import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] num = new int[1001];

		char[][] name = new char[1001][27];
		for (int i = 0;i < m;++i)
		{
		   num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   System.in.read();
		   name[i] = new Scanner(System.in).nextLine();
		}
		int[] count = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(count, 0, (Integer.SIZE / Byte.SIZE));
		int[][] record = new int[27][1000];
		int start = 0;
		int i;
		int j;
		 char call;
		for (i = 0;i < m;i++)
		{
		   for (j = 0;j < String.valueOf(name[i]).length();j++)
		   {
			  count[name[i][j]]++;
			   //call=name[i][j]-'A';
			  //record[call][start++]=num[i];
		   }
		}
		int max = 0;
		int k = 0;
		char t;
		for (char w = 'A';w <= 'Z';w++)
		{
		   if (count[(int)w] > max)
		   {
				  max = count[(int)w];
		   t = w;
		   }
		}
		System.out.print(t);
		System.out.print("\n");
	   System.out.print(max);
	   System.out.print("\n");
	  for (i = 0;i < m;i++)
	  {
		   for (j = 0;j < String.valueOf(name[i]).length();j++)
		   {
		   if (name[i][j] == t)
		   {
			   System.out.print(num[i]);
			   System.out.print("\n");
			   continue;
		   }
		   }
	  }

	   return 0;
	}

}

