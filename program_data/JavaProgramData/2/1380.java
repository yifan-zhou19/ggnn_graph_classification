public class student
{
	public String name = new String(new char[100]);
	public int num;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		head = p1;
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
		p2.next = p1;
		p2 = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		}
		p2.next = null;
		return (head);
	}

	public static void list(student head)
	{
		student p1;
		student p2;
		student p3;
		student p4;
		int i;
		int j;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
		String str = new String(new char[100]);
		p1 = head.next;
		for (i = 0;i < n;i++)
		{
			str = p1.name;
			for (j = 0;j < str.length();j++) //?????2?????i????
			{
				if (str.charAt(j) >= 'A' && str.charAt(j) <= 'Z')
				{
					a[str.charAt(j) - 65]++;
				} //?????????a[]????
			}
			p1 = p1.next;
		}
			for (i = 0;i < 26;i++)
			{
				b[i] = a[i];
			}
			for (i = 0;i < 26 - 1;i++)
			{
				for (j = 0;j < 26 - 1 - i;j++)
				{
				if (a[j] < a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				} //????
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (b[i] == a[0])
				{
					System.out.printf("%c\n%d\n",i + 65,a[0]);
					t = i;
				} //b[i]?=a[0]????????,??????
			}
		p1 = head.next; //??8??????????????????????????????????????????????
		 for (i = 0;i < n;i++)
		 {
			str = p1.name;
			for (j = 0;j < str.length();j++)
			{
				if (str.charAt(j) == t + 65)
				{
					System.out.printf("%d\n",p1.num);
				}
			}
			p1 = p1.next;
		 }
	}

	public static int Main()
	{
		student p;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   p = creat();
	   list(p);
	}

	//???????????????????????str?????????A-Z??????a[0]-a[25]????a[]????b[],b[]?????????????????a[]?
	//?b[]??a[0](?????)????????????????????
	//????????????????????? ????????????
}

