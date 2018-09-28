import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[252]);
		String s2 = new String(new char[252]);
	  int[] a = new int[252];
	  int[] b = new int[252];
	  int[] c = new int[252];

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c,0,252);
		s1 = new Scanner(System.in).nextLine();
	  s2 = new Scanner(System.in).nextLine();

	 int len1 = s1.length();
	 int len2 = s2.length();
	 if ((strcmp(s1,"0") == 0 && strcmp(s2,"0") == 0))
	 {
		 System.out.print('0');
		 System.out.print("\n");
		 return 0;
	 }
	 else
	 {
	 int i = 0;
	 int j = 0;
	 for (i = 0; i < len1; ++i)
	 {
		 a[i] = s1.charAt(i) - '0';
	 }
	 for (i = 0;i < len2;++i)
	 {
		 b[i] = s2.charAt(i) - '0';
	 }
	 for (i = 0;i < len1 / 2;i++)
	 {
		int temp;
		temp = a[i];
		a[i] = a[len1 - 1 - i];
		a[len1 - 1 - i] = temp;
	 }

	  for (j = 0;j < len2 / 2;j++)
	  {
		int temp;
		temp = b[j];
		b[j] = b[len2 - 1 - j];
		b[len2 - 1 - j] = temp;
	  }
	 for (i = 0;i < 252;i++)
	 {
		 a[i] += b[i];
		 if (a[i] >= 10)
		 {
		   a[i] -= 10;
		   a[i + 1]++;
		 }

	 }
		i = 251;
		 while (a[i] == 0)
		 {
			 i--;
		 }
		 for (;i >= 0;i--)
		 {
			 System.out.print((char)(a[i] + '0'));
		 }
		 System.out.print("\n");
	 }
		 return 0;
	}
}
