import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		  String s = new String(new char[100]);
		  s = new Scanner(System.in).nextLine(); //???????
		  int length = s.length(); //????????
		  int i = 0;
		  int j = 0;
		  int k;
		  int max = 0;
		  int temp;
		  int[] flag = new int[100];
		  char[][] shu = new char[100][1000];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		  memset(flag, 0, (Integer.SIZE / Byte.SIZE)); //???flag????0

		  for (k = 0 ; k < length ; k++)
		  {
						if (s.charAt(k) > 35)
						{
							   flag[i]++;
							   shu[i][j] = s.charAt(k);
							   j++;
						}
						  else
						  {
								i++;
								j = 0;
						  } //??????????????????
		  }
				   System.out.print(shu[i]);
					  for (k = i - 1 ; k >= 0 ; k--)
					  {
							   System.out.print(" ");
							   System.out.print(shu[k]);
					  }
			return 0;
	}

}
