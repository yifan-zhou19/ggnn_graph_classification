public class patient
{
	public String id = new String(new char[15]);
	public int age;
	public patient ne;
}

package <missing>;

public class GlobalMembers
{
	public static patient lian(int n)
	{
		int i;
		patient head;
		patient p;
		patient q;

		head = new patient();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			head.id = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			head.age = Integer.parseInt(tempVar2);
		}
		head.ne = null;
		q = head;
		for (i = 1;i < n;i++)
		{
			p = new patient();
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p.id = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p.age = Integer.parseInt(tempVar4);
			}
			p.ne = null;
			q.ne = p;
			q = p;
		}
		return head;
	}

	public static int Main()
	{
		int n;
		int max;
		int i;
		int sign;
		int b = 5000;
		patient head;
		patient p;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		head = lian(n);

		for (;;)
		{

			 for (p = head,max = -1,sign = 0;p != null;p = p.ne)
			 {
				 if (((p.age) >= 60) && max < (p.age) && ((p.age) < b))
				 {
					max = p.age;
					sign = 1;
				 }
			 }
			 b = max;
			if (sign == 0)
			{
				 break;
			}
			for (p = head;p != null;p = p.ne)
			{
				if ((p.age) == max)
				{
					System.out.printf("%s\n",p.id);

				}
			}

		}
		for (p = head;p != null;p = p.ne)
		{
			if ((p.age) < 60)
			{
				System.out.printf("%s\n",p.id);
			}
		}

		return 0;


	}
}

