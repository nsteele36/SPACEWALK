package md553b0e49968ee441dc787e1276af58725;


public class HIDPuckDongle_UsbReceiver
	extends android.content.BroadcastReceiver
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n" +
			"";
		mono.android.Runtime.register ("FitMiAndroid.HIDPuckDongle+UsbReceiver, FitMiAndroid", HIDPuckDongle_UsbReceiver.class, __md_methods);
	}


	public HIDPuckDongle_UsbReceiver ()
	{
		super ();
		if (getClass () == HIDPuckDongle_UsbReceiver.class)
			mono.android.TypeManager.Activate ("FitMiAndroid.HIDPuckDongle+UsbReceiver, FitMiAndroid", "", this, new java.lang.Object[] {  });
	}


	public void onReceive (android.content.Context p0, android.content.Intent p1)
	{
		n_onReceive (p0, p1);
	}

	private native void n_onReceive (android.content.Context p0, android.content.Intent p1);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
