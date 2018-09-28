import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[leng1]);
		char[][] b = new char[leng1][leng1];
		int[] count = new int[leng1];
		int leng = 0;
		int i;
		int j;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		while (*p != '\0')
		{
			leng++;
			p++;
		}
		for (i = 0;i <= leng - k;i++)
		{
		   b[i] = a.substring(i, i + k);
		}
		for (i = 0;i <= leng - k;i++)
		{
		   for (j = i;j <= leng - k;j++)
		   {
		   if (strcmp(b[i],b[j]) == 0)
		   {
			 count[i]++;
		   }
		   }
		}
		int max = 0;
		for (i = 0;i <= leng - k;i++)
		{
		   if (count[i] > max)
		   {
			   max = count[i];
		   }
		}
		if (max <= 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.print(max);
		System.out.print("\n");
		for (i = 0;i <= leng - k;i++)
		{
		   if (count[i] == max)
		   {
			   System.out.print(b[i]);
			   System.out.print("\n");
		   }
		}
		System.in.read();
		return 0;
	}

}

