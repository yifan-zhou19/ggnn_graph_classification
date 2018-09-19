public class stu
{
  public int num;
  public String au = new String(new char[50]);
  public stu next;

}

package <missing>;

public class GlobalMembers
{
	public static int N;

	public static stu creat() //????
	{
	  stu p1;
	  stu p2;
	  stu head;
	  int i;

	  for (i = 0;i < N;i++)
	  {
		p2 = p1;
		p1 = Z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.au = tempVar2.charAt(0);
		}
		p1.next = null;
		if (i == 0)
		{
			head = p1;
		}
		else
		{
			p2.next = p1;
		}
	  }

	  return head;


	}

	public static void Main()
	{
	  stu head;
	  stu p;
	  int i;
	  int n;
	  int j;
	  int max;
	  int max1;
	  int[] c = new int[26]; //?????????????c[i]??ASC??i+�A�????????
	  int[][] d = new int[26][1000]; //??????????????d[i]??ASC??i+�A�???????
	  int[] e = new int[26]; //??1???e[],????????d[]???????????????????


	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  N = Integer.parseInt(tempVar);
	  }
	  head = creat();

	  for (p = head;p != 0;p = p.next)
	  {
		  n = p.au.length();
		  for (i = 0,j = 0;i < n;i++)
		  {
			c[p.au.charAt(i) - 'A']++;
			d[p.au.charAt(i) - 'A'][e[p.au.charAt(i) - 'A']++] = p.num; //??2??e[]?????j???????j????????0

		  }

	  }

	  for (i = 0,max = 0;i < 26;i++)
	  {
		  if (max < c[i])
		  {
			  max1 = i;
			  max = c[i]; //??3?????????????max????????????0
		  }
	  }

	  System.out.printf("%c\n",max1 + 'A'); //??3??????
	  System.out.printf("%d\n",c[max1]); //??4???????????
	  i = 0;
	  while (d[max1][i] != 0)
	  {
		System.out.printf("%d\n",d[max1][i++]);
	  }



	}
}

