import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int t;
		 int i;
		 int j;
		 int len;
		 int flag2 = 0;
		 int temp;
		 int[] flag = new int[26];
		 String get = new String(new char[100001]);
		 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 System.in.read();
		 for (i = 0; i < t; i++)
		 {
			  get = new Scanner(System.in).nextLine();
			  len = get.length();
			  for (j = 0; j < len; j++)
			  {
					  temp = get.charAt(j) - 'a';
					  flag[temp]++;
			  }
			  for (j = 0; j < len; j++)
			  {
						temp = get.charAt(j) - 'a';

						if (flag[temp] == 1)
						{
							System.out.print(get.charAt(j));
							System.out.print("\n");
							flag2 = 1;
							break;
						}
			  }
			  if (flag2 == 0)
			  {
				  System.out.print("no");
				  System.out.print("\n");
			  }
			  flag2 = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			  memset(flag,0,(Integer.SIZE / Byte.SIZE));

		 }
		 return 0;
	}
}

