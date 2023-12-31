// Generated by view binder compiler. Do not edit!
package com.cs.csnotes.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.cs.csnotes.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityNotesBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final Button fifthunit;

  @NonNull
  public final Button firstunit;

  @NonNull
  public final Button fourthunit;

  @NonNull
  public final Button secondunit;

  @NonNull
  public final Button thirdunit;

  private ActivityNotesBinding(@NonNull LinearLayoutCompat rootView, @NonNull Button fifthunit,
      @NonNull Button firstunit, @NonNull Button fourthunit, @NonNull Button secondunit,
      @NonNull Button thirdunit) {
    this.rootView = rootView;
    this.fifthunit = fifthunit;
    this.firstunit = firstunit;
    this.fourthunit = fourthunit;
    this.secondunit = secondunit;
    this.thirdunit = thirdunit;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityNotesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_notes, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityNotesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fifthunit;
      Button fifthunit = ViewBindings.findChildViewById(rootView, id);
      if (fifthunit == null) {
        break missingId;
      }

      id = R.id.firstunit;
      Button firstunit = ViewBindings.findChildViewById(rootView, id);
      if (firstunit == null) {
        break missingId;
      }

      id = R.id.fourthunit;
      Button fourthunit = ViewBindings.findChildViewById(rootView, id);
      if (fourthunit == null) {
        break missingId;
      }

      id = R.id.secondunit;
      Button secondunit = ViewBindings.findChildViewById(rootView, id);
      if (secondunit == null) {
        break missingId;
      }

      id = R.id.thirdunit;
      Button thirdunit = ViewBindings.findChildViewById(rootView, id);
      if (thirdunit == null) {
        break missingId;
      }

      return new ActivityNotesBinding((LinearLayoutCompat) rootView, fifthunit, firstunit,
          fourthunit, secondunit, thirdunit);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
