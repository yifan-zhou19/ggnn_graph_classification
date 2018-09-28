import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************
	//?????************
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int times = 1;times <= n;times++)
		{
				 System.in.read();
				 final int max = 200;
				 String str1 = new String(new char[max + 1]);
				 String str2 = new String(new char[max + 1]);
				 int[] an1 = new int[max];
				 int[] an2 = new int[max];
				 str1 = new Scanner(System.in).nextLine();
				 str2 = new Scanner(System.in).nextLine();
				 int la = str1.length();
				 int lb = str2.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				 memset(an1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				 memset(an2,0,(Integer.SIZE / Byte.SIZE));
				 int i = 0;
				 int j = 0;
				 for (i = la - 1;i >= 0; i--)
				 {
					an1[j++] = str1.charAt(i) - '0';
				 }
				  j = 0;
				 for (i = lb - 1;i >= 0;i--)
				 {
					 an2[j++] = str2.charAt(i) - '0'; //??
				 }
				 for (i = 0;i < max;i++)
				 {
					  an1[i] = an1[i] - an2[i];
					  if (an1[i] < 0)
					  {
						an1[i] = an1[i] + 10;
						an1[i + 1] = an1[i + 1] - 1;
					  }
				 } //??
				i = max - 1;
				while (an1[i] == 0)
				{
				 i--;
				}
				for (;i >= 0;i--)
				{
				 System.out.print(an1[i]);
				}
				 System.out.print("\n");

		} //??

		return 0;

	}


}

