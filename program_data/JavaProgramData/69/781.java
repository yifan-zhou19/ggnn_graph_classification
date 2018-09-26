import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	   String a = new String(new char[253]);
	   String b = new String(new char[253]);
	   int[] a1 = new int[252];
	   int[] b1 = new int[252];
	   int[] c = new int[252];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	   memset(c,0,(Integer.SIZE / Byte.SIZE));
	   a = new Scanner(System.in).nextLine();
	   b = new Scanner(System.in).nextLine();
	   int length1 = a.length();
	   int length2 = b.length();
	  if (strcmp(a,"0") == 0 && strcmp(b,"0") == 0)
	  {
		  System.out.print('0');
		  System.out.print("\n");
	  }
	  else
	  {
		int i;
		int j = 0;
	   i = length1 - 1;
	   for (int temp = i;temp >= 0;temp--)
	   {
		   a1[j++] = a.charAt(temp) - '0';
	   }
	   i = length2 - 1;
	   j = 0;
	   for (int temp = i;temp >= 0;temp--)
	   {
		   b1[j++] = b.charAt(temp) - '0';
	   }
	  /* for(i=0;i<252;i++)
		{   c[i]=a1[i]+b1[i];
	      if(c[i]>=10)  
	       {
			  c[i]-=10;
			  c[i+1]++;
	       }
	   }*/
	   for (i = 0;i < 252;i++)
	   {
		 a1[i] += b1[i];
		 if (a1[i] >= 10)
		 {
		   a1[i] -= 10;
		   a1[i + 1]++;
		 }
	   }
	   i = 251;
	   while (a1[i] == 0)
	   {
		   i--;
	   }
	   for (;i >= 0;i--)
	   {
		   System.out.print(a1[i]);
	   }
	   System.out.print("\n");
	  }

	   return 0;
	}
}
