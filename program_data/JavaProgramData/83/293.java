package <missing>;

public class GlobalMembers
{
	public static float grade(tangible.RefObject<Integer> p2)
	{
		float n;
		if (p2.argValue >= 90 && p2.argValue <= 100)
		{
			n = 4.0f;
		}
		else if (p2.argValue >= 85 && p2.argValue <= 89)
		{
			n = 3.7f;
		}
		else if (p2.argValue >= 82 && p2.argValue <= 84)
		{
			n = 3.3f;
		}
		else if (p2.argValue >= 78 && p2.argValue <= 81)
		{
			n = 3.0f;
		}
		else if (p2.argValue >= 75 && p2.argValue <= 77)
		{
			n = 2.7f;
		}
		else if (p2.argValue >= 72 && p2.argValue <= 74)
		{
			n = 2.3f;
		}
		else if (p2.argValue >= 68 && p2.argValue <= 71)
		{
			n = 2.0f;
		}
		else if (p2.argValue >= 64 && p2.argValue <= 67)
		{
			n = 1.5f;
		}
		else if (p2.argValue >= 60 && p2.argValue <= 63)
		{
			n = 1.0f;
		}
		else
		{
			n = 0F;
		}
		return (n);
	}
	public static void Main()
	{
		int i;
		int n;
		int num = 0;
		int[] a = new int[10];
		int[] b = new int[10];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * p2;
		float[] c = new float[10];
		float GPA = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		p1 = a[0];
		p2 = b[0];
		for (i = 0;i < n;i++)
		{
			tangible.RefObject<Integer> tempRef_p2 = new tangible.RefObject<Integer>(p2);
				c[i] = (*p1) * (grade(tempRef_p2));
				p2 = tempRef_p2.argValue;
				p1++;
				p2++;
		}
		for (i = 0;i < n;i++)
		{
				GPA += c[i];
				num += a[i];
		}
		System.out.printf("%.2f\n",GPA / num);

	}
}

