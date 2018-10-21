package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float n;
		float m;
		float i;
		float a = 0F;
		float b = 0F;
		float c = 0F;
		float d = 0F;
		float e;
		float f;
		float g;
		float h;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (i = 0F;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Float.parseFloat(tempVar2);
			}
		 if ((m > 0F) && (m < 19F))
		 {
			 a++;
		 }
		 if ((m > 18F) && (m < 36F))
		 {
			 b++;
		 }
		 if ((m > 35F) && (m < 61F))
		 {
			 c++;
		 }
		 if (m > 60F)
		 {
			 d++;
		 }
		}
		e = (float)(100 * a / n);
		f = (float)(100 * b / n);
		g = (float)(100 * c / n);
		h = (float)(100 * d / n);
		System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",e,f,g,h);
	}

}

