public class book
{
	public int number;
	public String name = new String(new char[26]);
	public int[] num = new int[26];
}

package <missing>;

public class GlobalMembers
{
	public static void mostbook(book p)
	{
	   int i;
	   int j;
	   int k;
	   k = p.name.length();
	   for (j = 0;j < 26;j++) //???num???
	   {
		   p.num[j] = 0;
	   }
	   for (i = 0;i < k;i++)
	   {
			 (p.num[(p.name.charAt(i) - 'A')])++;
	   }
	}


	public static void Main()
	{
	   int i;
	   int j;
	   int m;
	   int max = 0;
	   int maxi = 0;
	   int[] s = new int[26];
	   //printf("???????:\n");
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   book p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	   p = (book)malloc(m * sizeof(book));
		  for (i = 0;i < m;i++)
		  {
		 // printf("????????\n");
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  (p + i).number = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  (p + i).name = tempVar3.charAt(0);
		  }
		  mostbook(p + i);
		  for (j = 0;j < 26;j++)
		  {
			s[j] += ((p + i).num[j]);
		  }
		  }
	   for (i = 0;i < 26;i++)
	   {
		   if (s[i] >= max)
		   {
			 max = s[i];
			 maxi = i;
		   }
	   }
	   //printf("????????\n");
	   System.out.printf("%c\n",(maxi + 'A'));
	   //printf("?????\n");
	   System.out.printf("%d\n",max);
	   //printf("?????\n");
	   for (i = 0;i < m;i++)
	   {
		  int k;
		  int j;
		  k = String.valueOf((p + i).name).length(); //??i?book??
		  for (j = 0;j < k;j++)
		  {
			 if ((p + i).name.charAt(j) == (maxi + 'A')) //??i?book??
			 {
				 System.out.printf("%d\n",(p + i).number);
				 continue; //????????????????continue
			 }
		  }
	   }

	}


}

